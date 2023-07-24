package com.platzi.platzimarket.persistence.mapper;

// import org.mapstruct.InheritInverseConfiguration;
// import org.mapstruct.Mapper;
// import org.mapstruct.Mapping;
// import org.mapstruct.Mappings;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.stereotype.Component;

import com.platzi.platzimarket.domain.Category;
import com.platzi.platzimarket.persistence.entity.Categoria;

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

    public Category toCategory(Categoria categoria) {
        Category category = new Category();
        category.setCategoryId(categoria.getIdCategoria());
        category.setCategory(categoria.getDescripcion());
        category.setActive(categoria.getEstado());

        return category;
        // return modelMapper.map(categoria, Category.class);
    }

    public Categoria toCategoria(Category category) {
        Categoria categoria = new Categoria();
        categoria.setIdCategoria(category.getCategoryId());
        categoria.setDescripcion(category.getCategory());
        categoria.setEstado(category.isActive());

        return categoria;
        // return modelMapper.map(category, Categoria.class);
    }
}
