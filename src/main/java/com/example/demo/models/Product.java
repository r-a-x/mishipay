package com.example.demo.models;

import com.example.demo.dto.ProductDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mongodb.BasicDBList;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by rahulb on 13/8/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
    @Id
    private String uid;

    @JsonProperty(value = "body_html")
    private String body_html;

    @JsonProperty(value = "created_at")
    private Date created_at;

    @JsonProperty(value = "handle")
    private String handle;

    @JsonProperty(value = "id")
    private String id;

// Two Other Properties

    @JsonProperty(value = "images")
     private BasicDBList images;

    @JsonProperty(value = "options")
    private BasicDBList options;

    @JsonProperty(value = "product_type")
    private String product_type;

    @JsonProperty(value = "published_at")
    private Date published_at;

    @JsonProperty(value = "published_scopes")
    private String published_scope;

    @JsonProperty(value = "tags")
    private String tags;


    @JsonProperty(value = "template_suffix")
    private String template_suffix;

    @JsonProperty(value = "title")
    private String title;

    @JsonProperty(value = "metafields_global_title_tag")
    private String metafields_global_title_tag;

    @JsonProperty("metafields_global_description_tag")
    private String metafields_global_description_tag;

    @JsonProperty(value = "updated_at")
    private Date updated_at;

    @JsonProperty(value = "variants")
    private List<Map<String,String>> variants;

    @JsonProperty(value = "vendor")
    private String vendor;

    public Product() {
    }

        public Product(String body_html, Date created_at, String handle, String id, BasicDBList images, BasicDBList options, String product_type, Date published_at, String published_scope, String tags, String template_suffix, String title, String metafields_global_title_tag, String metafields_global_description_tag, Date updated_at, List<Map<String, String>> variants, String vendor) {
        this.body_html = body_html;
        this.created_at = created_at;
        this.handle = handle;
        this.id = id;
        this.images = images;
        this.options = options;
        this.product_type = product_type;
        this.published_at = published_at;
        this.published_scope = published_scope;
        this.tags = tags;
        this.template_suffix = template_suffix;
        this.title = title;
        this.metafields_global_title_tag = metafields_global_title_tag;
        this.metafields_global_description_tag = metafields_global_description_tag;
        this.updated_at = updated_at;
        this.variants = variants;
        this.vendor = vendor;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getBody_html() {
        return body_html;
    }

    public void setBody_html(String body_html) {
        this.body_html = body_html;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
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

    public Date getPublished_at() {
        return published_at;
    }

    public void setPublished_at(Date published_at) {
        this.published_at = published_at;
    }

    public String getPublished_scope() {
        return published_scope;
    }

    public void setPublished_scope(String published_scope) {
        this.published_scope = published_scope;
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

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
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

    public ProductDto toProductDto(){
        return new ProductDto(uid,id,images,options,product_type,tags,template_suffix,title,metafields_global_title_tag,
                metafields_global_description_tag,
                variants,
                vendor
                );
    }


}
