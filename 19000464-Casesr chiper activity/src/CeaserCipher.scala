import scala.io.StdIn.readLine

object CeaserCipher extends App{

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  //Encryption function
  val E=(c:Char,key:Int,a:String)=>
    a((a.indexOf(c.toUpper)+key)%a.size)

  println("Enter text to be encrypted: ")
  val s = readLine()

  //Cipher function
  val cipher=(algo:(Char,Int,String)=>
    Char,s:String,key:Int,a:String)=>
    s.map(algo(_,key,a))

  val ct=cipher(E,s,5,alphabet)

  println("Encrypted text: "+ct)


  //Decryption function
  val D=(c:Char,key:Int,a:String)=>
    a((a.indexOf(c.toUpper)+alphabet.length-key)%a.size)

  println("Enter text to be decrypted: ")
  val d = readLine()

  val pt = cipher(D,d,5,alphabet)

  println("Decrypted text: "+pt)
}
