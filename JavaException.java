class JavaException extends Throwable {
    String str1;
    JavaException(String str2){this.str1=str2;}
    public String toString(){return ("Output String = "+str1);}
}
