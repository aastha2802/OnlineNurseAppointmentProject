package com.aastha.online_nurse_appointment_system.Mapper;

import com.ayash7.online_nurse_appointment_system.DTO.AdminDTO;
import com.ayash7.online_nurse_appointment_system.Entity.Credential;

public class AdminMapper {
    
    public static Credential mapToCredential(AdminDTO adminDTO) {
        
        return new Credential(adminDTO.getAdminUsername(), adminDTO.getAdminPassword(), "ADMIN");
        
    }
    
    public static AdminDTO mapToAdminDTO(Credential credential) {
        
        return new AdminDTO(credential.getEntityUsername(), credential.getEntityPassword());
        
    }
    
}