package com.platzi.platzimarket.persistence.mapper;

// import org.mapstruct.InheritInverseConfiguration;
// import org.mapstruct.Mapper;
// import org.mapstruct.Mapping;
// import org.mapstruct.Mappings;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.stereotype.Component;

import com.platzi.platzimarket.domain.Category;
import com.platzi.platzimarket.domain.Product;
import com.platzi.platzimarket.persistence.entity.Categoria;
import com.platzi.platzimarket.persistence.entity.Producto;

// @Mapper(componentModel = "spring")
@Component
public class CategoryMapper {

    private final ModelMapper modelMapper;

    public CategoryMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
        configureModelMapper();
    }

    private void configureModelMapper() {
        modelMapper.addMappings(new PropertyMap<Category, Categoria>() {
            @Override
            protected void configure() {
                skip().setProductos(null);
            }
        });
    }

    public Category toCategoryt(Categoria categoria) {
        return modelMapper.map(categoria, Category.class);
    }

    public Categoria toCategoria(Category category) {
        return modelMapper.map(category, Categoria.class);
    }
    
    /* @Mappings({
        @Mapping(source = "idCategoria", target = "categoryId"),
        @Mapping(source = "descripcion", target = "category"),
        @Mapping(source = "estado", target = "active"),
    })
    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Categoria toCategoria(Category category); */
}
