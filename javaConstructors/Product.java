class Product{
    String productName;
    double price;
    static int totalProduct = 0;

Product(String p,double m){
    this.productName=p;
    this.price=m;
    totalProduct++;
}
public void displayProductDetails(){
    System.out.println("product name : "+ productName+ "\n price "+price );

}
public static void displayTotalProduct(){
    System.out.println("total products : "+totalProduct);    
}
public static void main(String[]args){
    Product p1= new Product("maaza",20.0);
    Product p2= new Product("kurkure",20.0);
    Product p3 =new Product("dairy milk",10);

    p1.displayProductDetails();
    p2.displayProductDetails();
    p3.displayProductDetails();
    displayTotalProduct();
    
}
}