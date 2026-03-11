package sunrise.crm.product;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class XBundleDto {

 private List<XBundleProductDto> bundleProducts = new ArrayList<>();

 private String objid;

 private String bundleId;

 private String bundleStatus;

 private String bundleType;

 private String bundlePackLevel;

 public List<XBundleProductDto> getBundleProducts() {
  return bundleProducts;
 }

 public void setBundleProducts(List<XBundleProductDto> bundleProducts) {
  this.bundleProducts = bundleProducts;
 }

 public String getBundleId() {
  return bundleId;
 }

 public void setBundleId(String bundleId) {
  this.bundleId = bundleId;
 }

 public String getBundleStatus() {
  return bundleStatus;
 }

 public void setBundleStatus(String bundleStatus) {
  this.bundleStatus = bundleStatus;
 }

 public String getBundleType() {
  return bundleType;
 }

 public void setBundleType(String bundleType) {
  this.bundleType = bundleType;
 }

 public String getBundlePackLevel() {
  return bundlePackLevel;
 }

 public void setBundlePackLevel(String bundlePackLevel) {
  this.bundlePackLevel = bundlePackLevel;
 }

 public String getObjid() {
  return objid;
 }

 public void setObjid(String objid) {
  this.objid = objid;
 }

 @Override
 public String toString() {
  return new Gson().toJson(this);
 }
}
