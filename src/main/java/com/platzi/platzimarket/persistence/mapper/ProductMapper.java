package com.platzi.platzimarket.persistence.mapper;

import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.stereotype.Component;

import com.platzi.platzimarket.domain.Product;
import com.platzi.platzimarket.persistence.entity.Producto;

@Component
public class ProductMapper {

    private final ModelMapper modelMapper;
    private final CategoryMapper categoryMapper;

    public ProductMapper(ModelMapper modelMapper, CategoryMapper categoryMapper) {
        this.modelMapper = modelMapper;
        this.categoryMapper = categoryMapper;
        configureModelMapper();
    }

    private void configureModelMapper() {
        modelMapper.addMappings(new PropertyMap<Product, Producto>() {
            @Override
            protected void configure() {
                // skip().setCodigoBarras(null);
                map().setCodigoBarras(null);
            }
        });
    }

    public Product toProduct(Producto producto) {
        // return modelMapper.map(producto, Product.class);
        Product product = new Product();

        product.setProductId(producto.getIdProducto());
        product.setName(producto.getNombre());
        product.setCategoryId(producto.getIdCategoria());
        product.setPrice(producto.getPrecioVenta());
        product.setStock(producto.getCantidadStock());
        product.setActive(producto.getEstado());
        product.setCategory(categoryMapper.toCategory(producto.getCategoria()));

        return product;
    }

    public List<Product> toProducts(List<Producto> productos) {
        // return productos.stream()
        // .map(producto -> modelMapper.map(producto, Product.class))
        // .collect(Collectors.toList());
        List<Product> products = new ArrayList<>();

        for (Producto producto : productos) {
            products.add(toProduct(producto));
        }

        return products;

    }

    public Producto toProducto(Product product) {
        Producto producto = new Producto();

        producto.setIdCategoria(product.getCategoryId());
        producto.setNombre(product.getName());
        producto.setCodigoBarras(null);
        producto.setPrecioVenta(product.getPrice());
        producto.setCantidadStock(product.getStock());
        producto.setEstado(product.isActive());
        // producto.setCategoria(categoryMapper.toCategoria(product.getCategory()));

        return producto;

        // return modelMapper.map(product, Producto.class);
    }
}
