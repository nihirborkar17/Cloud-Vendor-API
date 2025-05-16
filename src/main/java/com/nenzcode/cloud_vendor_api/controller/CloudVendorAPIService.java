package com.nenzcode.cloud_vendor_api.controller;



import com.nenzcode.cloud_vendor_api.model.CloudVendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    @Autowired
    CloudVendor cloudVendor;

    @GetMapping("/{VendorId}")
    public CloudVendor getCloudVendorDetail(String VendorId){
        return cloudVendor;
//                new CloudVendor("C1", "Vendor1",
//                        "address1", "XXXXX");
    }

    @PostMapping
    public String createCloudVendorDetail(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created Successfully!...";
    }

    @PutMapping
    public String updateCloudVendorDetail(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Updated Successfully!...";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetail(String vendorId){
        this.cloudVendor = null;
        return "Cloud Vendor deleted Successfully!...";
    }


}
