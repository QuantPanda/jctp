/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ctp;

public class CThostFtdcQryAccountregisterField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryAccountregisterField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryAccountregisterField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcQryAccountregisterField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    ctpJNI.CThostFtdcQryAccountregisterField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return ctpJNI.CThostFtdcQryAccountregisterField_BrokerID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    ctpJNI.CThostFtdcQryAccountregisterField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return ctpJNI.CThostFtdcQryAccountregisterField_AccountID_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    ctpJNI.CThostFtdcQryAccountregisterField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return ctpJNI.CThostFtdcQryAccountregisterField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    ctpJNI.CThostFtdcQryAccountregisterField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return ctpJNI.CThostFtdcQryAccountregisterField_BankBranchID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    ctpJNI.CThostFtdcQryAccountregisterField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return ctpJNI.CThostFtdcQryAccountregisterField_CurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcQryAccountregisterField() {
    this(ctpJNI.new_CThostFtdcQryAccountregisterField(), true);
  }

}