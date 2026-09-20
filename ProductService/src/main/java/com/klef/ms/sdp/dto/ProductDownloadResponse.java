package com.klef.ms.sdp.dto;

public class ProductDownloadResponse {

    private Long productId;
    private String name;
    private String downloadUrl;

    public ProductDownloadResponse() {
    }

    public ProductDownloadResponse(Long productId, String name, String downloadUrl) {
        this.productId = productId;
        this.name = name;
        this.downloadUrl = downloadUrl;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
}