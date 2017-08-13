package com.example.demo.dto;

import com.mongodb.BasicDBList;

import java.util.List;
import java.util.Map;

/**
 * Created by rahulb on 13/8/17.
 */
public class ProductDto {
    private String uid;

    private String id;

    private BasicDBList images;

    private BasicDBList options;

    private String product_type;

    private String tags;

    private String template_suffix;

    private String title;

    private String metafields_global_title_tag;

    private String metafields_global_description_tag;

    private List<Map<String,String>> variants;

    private String vendor;

    public ProductDto(String uid, String id, BasicDBList images, BasicDBList options, String product_type, String tags, String template_suffix, String title, String metafields_global_title_tag, String metafields_global_description_tag, List<Map<String, String>> variants, String vendor) {
        this.uid = uid;
        this.id = id;
        this.images = images;
        this.options = options;
        this.product_type = product_type;
        this.tags = tags;
        this.template_suffix = template_suffix;
        this.title = title;
        this.metafields_global_title_tag = metafields_global_title_tag;
        this.metafields_global_description_tag = metafields_global_description_tag;
        this.variants = variants;
        this.vendor = vendor;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BasicDBList getImages() {
        return images;
    }

    public void setImages(BasicDBList images) {
        this.images = images;
    }

    public BasicDBList getOptions() {
        return options;
    }

    public void setOptions(BasicDBList options) {
        this.options = options;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getTemplate_suffix() {
        return template_suffix;
    }

    public void setTemplate_suffix(String template_suffix) {
        this.template_suffix = template_suffix;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMetafields_global_title_tag() {
        return metafields_global_title_tag;
    }

    public void setMetafields_global_title_tag(String metafields_global_title_tag) {
        this.metafields_global_title_tag = metafields_global_title_tag;
    }

    public String getMetafields_global_description_tag() {
        return metafields_global_description_tag;
    }

    public void setMetafields_global_description_tag(String metafields_global_description_tag) {
        this.metafields_global_description_tag = metafields_global_description_tag;
    }

    public List<Map<String, String>> getVariants() {
        return variants;
    }

    public void setVariants(List<Map<String, String>> variants) {
        this.variants = variants;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
}
