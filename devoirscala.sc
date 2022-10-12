def linesFrom(fileName:String)  = { 
  val source = scala.io.Source.fromFile(fileName) 
  val text = try source.getLines mkString "\n" finally source.close() text 
}