package com;

public class Contactform {
    
        
        private String email;
        private String phone;
        private String message;
        private String id;

        public Contactform(String id, String phone, String email, String message) {
            this.id = id;
            this.phone = phone;
            this.email = email;
            this.message = message;
        }
    
        
        public Contactform() {
        }
    
        
        public String getId() {
            return id;
        }
    
        public String getPhone() {
            return phone;
        }
    
        public String getEmail() {
            return email;
        }
    
        public String getMessage() {
            return message;
        }
    
        
        public void setId(String id) {
            this.id = id;
        }
    
        public void setPhone(String phone) {
            this.phone = phone;
        }
    
        public void setEmail(String email) {
            this.email = email;
        }
    
        public void setMessage(String message) {
            this.message = message;
        }
    
        
    
    
    
}
