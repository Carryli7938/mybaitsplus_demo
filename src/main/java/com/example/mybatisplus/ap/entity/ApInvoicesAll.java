package com.example.mybatisplus.ap.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 *  实体类
 * </p>
 *
 * @author lida
 * @since 2020-09-09
 */
@TableName("AP_INVOICES_ALL")
public class ApInvoicesAll implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "INVOICE_ID", type = IdType.AUTO)
    private Integer invoiceId;

    @TableField("LAST_UPDATE_DATE")
    private LocalDateTime lastUpdateDate;

    @TableField("LAST_UPDATED_BY")
    private String lastUpdatedBy;

    @TableField("VENDOR_ID")
    private Integer vendorId;

    @TableField("INVOICE_NUM")
    private String invoiceNum;

    @TableField("SET_OF_BOOKS_ID")
    private Integer setOfBooksId;

    @TableField("INVOICE_CURRENCY_CODE")
    private String invoiceCurrencyCode;

    @TableField("PAYMENT_CURRENCY_CODE")
    private String paymentCurrencyCode;

    @TableField("INVOICE_AMOUNT")
    private BigDecimal invoiceAmount;

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }
    public LocalDateTime getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(LocalDateTime lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }
    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }
    public String getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum;
    }
    public Integer getSetOfBooksId() {
        return setOfBooksId;
    }

    public void setSetOfBooksId(Integer setOfBooksId) {
        this.setOfBooksId = setOfBooksId;
    }
    public String getInvoiceCurrencyCode() {
        return invoiceCurrencyCode;
    }

    public void setInvoiceCurrencyCode(String invoiceCurrencyCode) {
        this.invoiceCurrencyCode = invoiceCurrencyCode;
    }
    public String getPaymentCurrencyCode() {
        return paymentCurrencyCode;
    }

    public void setPaymentCurrencyCode(String paymentCurrencyCode) {
        this.paymentCurrencyCode = paymentCurrencyCode;
    }
    public BigDecimal getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(BigDecimal invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    @Override
    public String toString() {
        return "ApInvoicesAll{" +
            "invoiceId=" + invoiceId +
            ", lastUpdateDate=" + lastUpdateDate +
            ", lastUpdatedBy=" + lastUpdatedBy +
            ", vendorId=" + vendorId +
            ", invoiceNum=" + invoiceNum +
            ", setOfBooksId=" + setOfBooksId +
            ", invoiceCurrencyCode=" + invoiceCurrencyCode +
            ", paymentCurrencyCode=" + paymentCurrencyCode +
            ", invoiceAmount=" + invoiceAmount +
        "}";
    }
}
