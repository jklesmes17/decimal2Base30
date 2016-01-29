package test

trait DecimalToBase {
   implicit def decimal(hex: Int) = new {
      def base30: String = Integer.toString(hex, 30)
    }
}
