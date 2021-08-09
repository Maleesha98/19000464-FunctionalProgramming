import scala.io.StdIn.readLine

object CeaserCipher extends App{

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  //Encryption function
  val E=(c:Char,key:Int,a:String)=>
    a((a.indexOf(c.toUpper)+key)%a.size)
  //Decryption function
  val D=(c:Char,key:Int,a:String)=>
    a((a.indexOf(c.toUpper)-key)%a.size)

  println("Enter text to be encrypted: ")
  val s = readLine()

  //Cipher function
  val cipher=(algo:(Char,Int,String)=>
    Char,s:String,key:Int,a:String)=>
    s.map(algo(_,key,a))

  val ct=cipher(E,s,5,alphabet)
  val pt = cipher(D,ct,5,alphabet)

  println("Encrypted text: "+ct)
  println("Decrypted text: "+pt)


}

