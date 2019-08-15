package livro;

public class Livro {
   private String titulo;
   private String Autor;
   private String Isbn;
   private int qtd_de_pagina;
   private String ano;
   private String editora;
   private double valor;
   private String texto;
   
   
   public void setTitulo(String titulo){
       this.titulo=titulo;
   }
   public String getTitulo(){
       return this.titulo;
   }
   public void setAutor(String Autor){
       this.Autor=Autor;
   }
   public String getAutor(){
       return this.Autor;
   }
   public void setIsbn(String Isbn){
       this.Isbn=Isbn;
   }
   public String getIsbn(){
       return this.Isbn;
   }
   public void setQtd_de_pagina(int qtd_de_pagina){
       this.qtd_de_pagina= qtd_de_pagina;
   }
   public int getQtd_de_pagina(){
       return this.qtd_de_pagina;
   }
   public void setAno(String ano){
       this.ano=ano;
   }
   public String getAno(){
       return this.ano;
   }
   public void setEditora(String editora){
       this.editora=editora;
   }
   public String getEditora(){
       return this.editora;
   }
   public void setValor(Double valor){
       this.valor=valor;
   }
   public Double getValor(){
       return this.valor;
   }
   
   public String exibir(){
       texto = "Titulo do Livro: "+this.titulo;
       texto += "Autor: "+this.Autor;
       texto += "Isbn: "+this.Isbn; 
       texto += "qtd de paginas: "+this.qtd_de_pagina;
       texto += "ano: "+this.ano;
       texto += "editora: "+this.editora;
       texto += "valor: "+this.valor;
       return titulo;
   }
}
