package com.platzi.platzimarket.persistence.mapper;

import java.util.List;
import java.util.stream.Collectors;

// import org.mapstruct.InheritInverseConfiguration;
// import org.mapstruct.Mapper;
// import org.mapstruct.Mapping;
// import org.mapstruct.Mappings;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.Mapping;

import com.platzi.platzimarket.domain.Product;
import com.platzi.platzimarket.persistence.entity.Producto;

// @Mapper(componentModel = "spring", uses = {CategoryMapper.class})
@Component
public class ProductMapper {

    private final ModelMapper modelMapper;

    public ProductMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
        configureModelMapper();
    }

    private void configureModelMapper() {
        modelMapper.addMappings(new PropertyMap<Product, Producto>() {
            @Override
            protected void configure() {
                skip().setCodigoBarras(null);
            }
        });
    }

    public Product toProduct(Producto producto) {
        return modelMapper.map(producto, Product.class);
    }

    public List<Product> toProducts(List<Producto> productos) {
        return productos.stream()
                .map(producto -> modelMapper.map(producto, Product.class))
                .collect(Collectors.toList());
    }

    public Producto toProducto(Product product) {
        return modelMapper.map(product, Producto.class);
    }

    // Product product = modelMapper.map(Producto.class, Product.class);
    
    /* @Mappings({
        @Mapping(source = "idProducto", target = "productId"),
        @Mapping(source = "nombre", target = "name"),
        @Mapping(source = "idCategoria", target = "categoryId"),
        @Mapping(source = "precioVenta", target = "price"),
        @Mapping(source = "cantidadStock", target = "stock"),
        @Mapping(source = "estado", target = "active"),
        @Mapping(source = "categoria", target = "category")
    })
    Product toProduct(Producto producto);

    List<Product> toProducts(List<Producto> productos);

    @InheritInverseConfiguration
    @Mapping(target = "codigoBarras", ignore = true)
    Producto toProducto(Product product); */
}
