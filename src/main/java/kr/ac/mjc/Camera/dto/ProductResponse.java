package kr.ac.mjc.Camera.dto;

import kr.ac.mjc.Camera.domain.Product;

public class ProductResponse {
    private boolean success;
    private String message;
    private Product article;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Product getArticle() {
        return article;
    }

    public void setArticle(Product article) {
        this.article = article;
    }
}