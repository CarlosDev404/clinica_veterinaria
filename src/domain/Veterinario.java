package domain;

public class Veterinario {

        private String crmv;

        public String getCrmv() {
            return crmv;
        }

        public void setCrmv(String crmv) {
            this.crmv = crmv;
        }

        public Veterinario(String crmv) {
            this.crmv = crmv;
        }

        @Override
        public String toString() {
            return "Veterinario [crmv=" + crmv + ", getCrmv()=" + getCrmv() + ", getClass()=" + getClass()
                    + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
        }



        
}
