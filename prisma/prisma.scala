import scala.io.Source
import java.io.File
  
object prisma {
  
	def follow(x: String)= println("follow "+x)
	
	def list()  {
	  val f = new File(".prisma")
	  if (f.exists)
		Source.fromFile(f).getLines.foreach(print)
	}
 
	def show(x: String) = println("list")
	
	def usage() = { 
	    println("usage:\n [follow <word>|show <word>|list]")
	    exit(1)
	}

	def main(args: Array[String]) {
	  
		args match {
		    case Array("follow", word) => follow(word)
		    case Array("show", word)   => show(word)
		    case Array("list")         => list()
		    case _ => usage()
		}
	}
}
// vim: set ts=4 sw=4 et:
