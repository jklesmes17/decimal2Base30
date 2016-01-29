package test

trait DecimalToBase {
   implicit def decimal(num: Int) = new {
      def base30: String = Integer.toString(num, 30)
    }
}
