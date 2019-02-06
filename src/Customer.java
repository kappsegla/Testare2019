public class Customer {

    String id;

    Customer(){
        this(null);
    }


    Customer(String uuid){

        if( uuid == null)
            this.id = java.util.UUID.randomUUID().toString();
        else
            this.id = uuid;
    }


    public static void main(String[] args) {
        Customer customer = new Customer("238478278432");
        System.out.println(customer.id);
        String test = "931da";
        System.out.println(customer.id.startsWith(test));

    }

}
