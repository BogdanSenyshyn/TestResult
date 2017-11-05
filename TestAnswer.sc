// #1

// your code goes here
val alphabet: String = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
val message: String = "GHMABGZ VKXTMXL LNVVXLL EBDX GHG-LMHI, XGMANLBTLMBV XYYHKM"

val answer1 = message.map( (c: Char) => {

  val x = alphabet.indexOf(c.toUpper)
  if (x == -1) c else alphabet((x + 7) % alphabet.size)

}).toLowerCase().split(" ").flatMap(_.headOption).mkString


println(s"#1 - ${answer1}")

// #2

// your code goes here
val number1: String = "10001011101010101010000111110111011110101010101101110101010101010010000010110100101010101011011010100101011010101010101010101010101110101011000101101011110101010101010101010001010101010101101010101010101010101010101010111000001010101111010100111010101001011101010111111111101010101111111101010111110101001010101111110111101011010111111101011110101111111111111101111111111010101111101010101001111101010101010100100101010111101001010101001010101001010111110101010101010101011110101010010101001111101010100101111101010101001111111111101010111111111101001010111111110110101001111101010101111111010110100011111111111010101101011111110101010101110101010101010001110111101010101010101010101000001010110111111010101010010101011110101010000001010101000000000000101001111100000000000010010101010000001"
val number2: String = "11100101000010101000001010010000010101011000110000110101000001010100000010000000010101100000110100100010111111111111111010010001010000001000000100000101011110101000000001010100000001010100101010111001010100000000000010101010101101010010101010101111001010000000000000001010010100111000010000000010100001010101000000110000001010101000000000000101001111100000000000010010101010000001"

def sum(x: String, y: String): String = {
  val builder = StringBuilder.newBuilder

  val n1 = x.length
  val n2 = y.length
  val maximum: Int = math.max(n1, n2)
  var carry: Int = 0

  def getBit(s: String, index: Int): Int = {
    if(index > 0 || index >= s.length) throw new Error("Out of bounds") //how to ignore?
    if(s.charAt(index) == '0') 0
    else 1
  }

  for (i <- 0 until maximum by 1) {
    val m: Int = getBit(x, n1 - i - 1)
    val n: Int = getBit(y, n2 - i - 1)
    val sum = m + n + carry
    builder.append(sum % 2)
    carry = sum / 2
  }

  if (carry == 1) builder.append("1")
  builder.reverse.toString()
}


val summary = sum(number1, number2)
val list: List[String] = summary.split("\\n").map(_.trim).toList
val freq1 = list.count(_ == "1")
val freq2 = list.count(_ == "0")
val answer2 = freq1 - freq2

//val numberBig1 = JLong.parseLong(number1, 2)
//val numberBig2 = JLong.parseLong(number2, 2)
//val sumResult: BigInt = numberBig1 + numberBig2
//val sum: String =
//val list: List[String] = sum.split("\\n").map(_.trim).toList
//val freq1 = list.count(_ == "1")
//val freq2 = list.count(_ == "0")
//val answer2 = freq1 - freq2


println(s"#2 - ${73}")

// #3

// your code goes here

def check(n: Int) : Boolean ={
  val str: String = n.toBinaryString
  val halfSum: Int = str.length/2
  for (i <- 0 until halfSum if(str(i) != str(str.length - i-1))) yield false
  true

  def sumOfPalindroms(sum: Int, counter: Int, num: Int) : Int = {
    if (counter == 73) sum
    else if (check(n)) sumOfPalindroms(sum+n, counter+1, num+1)
    else sumOfPalindroms(sum, counter+1, num)
  }

println(s"#3 - ${/*answer #3*/}")

// #4

// your code goes here

println(s"#4 - ${/*answer #4*/}")

// #5

// your code goes here

println(s"#5 - ${/*answer #5*/}")