
package lab3;

public class DataTypesTester {
    public static void testByte() {

        byte a = 3, b = 2, c=0;
		
		System.out.println("DataType - byte");
	        System.out.println("Arithmetic operations");
	                
		c = (byte) (a + b); //addition
		System.out.printf("%d + %d = %d\n", a, b, c);
	        
		c = (byte) (a - b); //subtraction
		System.out.printf("%d - %d = %d\n", a, b, c);
	        
		c = (byte) (a * b); //multiplication
		System.out.printf("%d * %d = %d\n", a, b, c);
	        
		c = (byte) (a / b); //division
		System.out.printf("%d / %d = %d\n", a, b, c);

		c = (byte) (a % b); //modulus
		System.out.printf("%d %% %d = %d\n", a, b, c);
	        
		a = 3;
		c = (byte) -a; // unary minus
		System. out.printf("-%d = %d\n", a, c);
		
		c = (byte) +a; // unary plus 
		System. out.printf("+%d = %d\n", a, c);
		
		System. out.printf("++%d = %d\n", a, ++a); // prefix increment
		
		System. out.printf("%d++ = %d", a, a++); // postfix increment 
		System. out.printf(" but in the next step a = %d\n", a);
	        
		System. out.printf("--%d = %d\n", a, --a); // prefix decrement
		
		System. out.printf("%d-- = %d", a, a--); // postfix decrement
                System. out.printf(" but in the next step a = %d\n", a);
	        
		System.out.println("DataType - byte");
                System.out.println("Relational operations");
			
		System. out.printf("%d > %d = %b\n", a, b, a > b); // greater than
			
		System. out.printf("%d >= %d = %b\n", a, b, a >= b); // greater than or equal to

		System. out.printf("%d < %d = %b\n", a, b, a < b); // less than
			
		System. out.printf("%d <= %d = %b\n", a, b, a <= b); // less than or equal to
			
		System. out.printf("%d == %d = %b\n", a, b, a == b); // equal to
			
		System. out.printf("%d != %d = %b\n", a, b, a != b); // not equal to
		
		System.out.println("DataType - byte");
                System.out.println("Logical operations");
			
		System. out.printf("(%d > %d) && (%d > 0) = %b\n", 
	        a, b, a, (a > b) && (a > 0)); // logical AND
			
		System. out.printf("(%d > %d) & (%d > 0) = %b\n", 
	        a, b, a, (a > b) & (a > 0)); // bitwise logical AND
			
		System. out.printf("(%d >= %d) || (%d != 0) = %b\n", 
	        a, b, b, (a >= b) || (b != 0)); // logical OR
			
		System. out.printf("(%d >= %d) | (%d != 0) = %b\n", 
	        a, b, b,(a >= b) | (b != 0)); // bitwise logical OR
			
		System. out.printf("(%d >= %d) ^ (%d != 0) = %b\n",
	        a, b, b, (a >= b) ^ (b != 0)); // logical XOR
			
		System. out.printf("!(%d >= %d) = %b\n", a, b, !(a >= b)); // logical NOT
			
		System.out.println("DataType - byte");
                System.out.println("Bitwise operations");	
		
		c = (byte) (a & b); // bitwise AND
		System. out.printf("%d & %d = %d\n", a, b, c);
		System. out.println("Binary form:");
		System. out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
			Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = (byte) (a | b); // bitwise OR
		System. out.printf("%d | %d = %d\n", a, b, c);
		System. out.println("Binary form:");
		System. out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
			Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = (byte) (a ^ b); // bitwise XOR
		System. out.printf("%d ^ %d = %d\n", a, b, c);
		System. out.println("Binary form:");
		System. out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
			Integer.toBinaryString(b), Integer.toBinaryString(c));

		c = (byte) ~a; // bitwise unary compliment
		System. out.printf("~%d = %d\n", a, c);
		System. out.println("Binary form:");
		System. out.printf("~%s = %s\n", Integer.toBinaryString(a),
			Integer.toBinaryString(c));

		c = (byte) (a << 1); // left shift
		System. out.printf("%d << 1 = %d\n", a, c);
		System. out.println("Binary form:");
		System. out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
			Integer.toBinaryString(c));

		c = (byte) (a >> 1); // right shift
		System. out.printf("%d >> 1 = %d\n", a, c);
		System. out.println("Binary form:");
		System. out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
			Integer.toBinaryString(c));

		a = -5;
		c = (byte) (a >> 1); // right shift
		System. out.printf("%d >> 1 = %d\n", a, c);
		System. out.println("Binary form:");
		System. out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
			Integer.toBinaryString(c));

		a = 3;
		c = (byte) (a >>> 1); // zero fill right shift
		System. out.printf("%d >>> 1 = %d\n", a, c);
		System. out.println("Binary form:");
		System. out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
			Integer.toBinaryString(c));
			
		a = -3;
		c = (byte) (a >>> 1); // zero fill right shift
		System. out.printf("%d >>> 1 = %d\n", a, c);
		System. out.println("Binary form:");
		System. out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
			Integer.toBinaryString(c));
			
		System.out.println("DataType - byte");
                System.out.println("Assignment Operations");	
			
		c = 3;
		System. out.printf("%d += %d -> c = %d\n", c, a, c += a);
		System. out.printf("%d -= %d -> c = %d\n", c, a, c -= a);
		System. out.printf("%d *= %d -> c = %d\n", c, a, c *= a);
		System. out.printf("%d /= %d -> c = %d\n", c, a, c /= a);
		System. out.printf("%d %%= %d -> c = %d\n", c, a, c %= a);
		System. out.printf("%d |= %d -> c = %d\n", c, a, c |= a);
		System. out.printf("%d &= %d -> c = %d\n", c, a, c &= a);
		System. out.printf("%d ^= %d -> c = %d\n", c, a, c ^= a);
		System. out.printf("%d >>= 1 -> c = %d\n", c, c >>= 1);
		System. out.printf("%d <<= 1 -> c = %d\n", c, c <<= 1);
		System. out.printf("%d >>>= 1 -> c = %d\n", c, c >>>= 1);
					
		System.out.println("DataType - byte");
                System.out.println("Misc Operations");	
					
		System. out.println("\nCondition Operator:");
                
		System. out.printf("%d > %d ? %d : %d -> %d\n", 
                    a, b, a, b, (a > b ? a : b)); //ternary operator
                
		System. out.println("\nType Cast Operator:");
                
		short sh = 32767;
		int i = 2147483647;
		char ch = '\uffff' ;
		long l = 9223372036854775807L;
		float f = 3.4E+38f;
		double d = 1.7E+308;
		boolean bool = true;
			
		c = (byte) sh;
		System. out.printf("byte = short: c = %d -> c = %d\n", sh, c);
		c = (byte) i;
		System.out.printf("byte = int: c = '%d' -> c = %d\n", i, c);
		c = (byte) ch;
		System. out.printf("byte = char: c = '%c' -> c = %d\n", ch, c);
		c = (byte) l;
		System. out.printf("byte = long: c = (byte)%d -> c = %d\n", l, c);
		c = (byte) f;
		System. out.printf("byte = float: c = (byte)%f -> c = %d\n", f, c);
		c = (byte) d;
		System. out.printf("byte = double: c = (byte)%f --> c = %d\n", d, c);
		// c = (byte) bool;
		System. out.printf("byte = boolean: c = (byte)%b -> Compile Error\n",
		bool);
	}

	public static void testShort() {

		short a = 3, b = 2, c=0;
		
		System.out.println("DataType - byte");
                System.out.println("Arithmetic Operations");	
		
		c = (short) (a + b); //addition
		System.out.printf("%d + %d = %d\n", a, b, c);
		
		c = (short) (a - b); //subtraction
		System.out.printf("%d - %d = %d\n", a, b, c);
		
		c = (short) (a * b); //multiplication
		System.out.printf("%d * %d = %d\n", a, b, c);
		
		c = (short) (a / b); //division
		System.out.printf("%d / %d = %d\n", a, b, c);
		
		c = (short) (a % b); //modulus
		System.out.printf("%d %% %d = %d\n", a, b, c);
                
		a = 3;
		c = (short) -a; // unary minus
		System. out.printf("-%d = %d\n", a, c);
		
		c = (short) +a; // unary plus
		System. out.printf("+%d = %d\n", a, c);
		
		a = 3;
		System. out.printf("++%d = %d\n", a, ++a); // prefix increment
		
		a = 3;
		System. out.printf("%d++ = %d\n", a, a++); // postfix increment
		
		a = 3;
		System. out.printf("--%d = %d\n", a, --a); // prefix decrement
		
		a = 3;
		System. out.printf("%d-- = %d\n", a, a--); // postfix decrement
		
		System.out.println("DataType - byte");
                System.out.println("Relational Operations");	
		
		System. out.printf("%d > %d = %b\n", 
                        a, b, a > b); // greater than
		
		System. out.printf("%d >= %d = %b\n", 
                        a, b, a >= b); // greater than or equal to
		
		System. out.printf("%d < %d = %b\n", 
                        a, b, a < b); // less than
		
		System. out.printf("%d <= %d = %b\n", 
                        a, b, a <= b); // less than or equal to
		
		System. out.printf("%d == %d = %b\n", 
                        a, b, a == b); // equal to
		
		System. out.printf("%d != %d = %b\n", 
                        a, b, a != b); // not equal to
	
		System.out.println("DataType - byte");
                System.out.println("Logical Operations");	
		
		System. out.printf("(%d > %d) && (%d > 0) --> %b\n", 
			a, b, a, (a > b) && (a > 0)); // logical AND
		
		System. out.printf("(%d > %d) & (%d > 0) --> %b\n", 
			a, b, a, (a > b) & (a > 0)); // bitwise logical AND
		
		System. out.printf("(%d >= %d) || (%d != 0) --> %b\n", 
			a, b, b, (a >= b) || (b != 0)); // logical OR
		
		System. out.printf("(%d >= %d) | (%d != 0) --> %b\n", 
			a, b, b, (a >= b) | (b != 0)); // bitwise logical OR
		
		System. out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", 
			a, b, b, (a >= b) ^ (b != 0)); // logical XOR
 		
		System. out.printf("!(%d >= %d) --> %b\n", 
                        a, b, !(a >= b)); // logical NOT
		
		System.out.println("DataType - byte");
                System.out.println("Bitwise Operations");
		
		c = (short) (a & b); // bitwise AND
		System. out.printf("%d & %d = %d\n", a, b, c);
		System. out.println("in binary form:");
		System. out.printf("%s & %s = %s\n", Integer.toBinaryString(a), 
                        Integer.toBinaryString(b), Integer.toBinaryString(c));
                
		c = (short) (a | b); // bitwise OR
		System. out.printf("%d | %d = %d\n", a, b, c);
		System. out.println("in binary form:");
		System. out.printf("%s | %s = %s\n", Integer.toBinaryString(a), 
                        Integer.toBinaryString(b), Integer.toBinaryString(c));
                
		c = (short) (a ^ b); // bitwise XOR
		System. out.printf("%d ^ %d = %d\n", a, b, c);
		System. out.println("in binary form:");
		System. out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), 
                        Integer.toBinaryString(b), Integer.toBinaryString(c));
                
		c = (short) ~a; // bitwise unary compliment
		System. out.printf("~%d = %d\n", a, c);
		System. out.println("in binary form:");
		System. out.printf("~%s = %s\n", Integer.toBinaryString(a), 
                        Integer.toBinaryString(c));
                
		c = (short) (a << 1); // left shift
		System. out.printf("%d << 1 = %d\n", a, c);
		System. out.println("in binary form:");
		System. out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
		Integer.toBinaryString(c));
                
		c = (short) (a >> 1); // right shift
		System. out.printf("%d >> 1 = %d\n", a, c);
		System. out.println("in binary form:");
		System. out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), 
                        Integer.toBinaryString(c));
                
		a = -3;
		c = (short) (a >> 1); // right shift
		System. out.printf("%d >> 1 = %d\n", a, c);
		System. out.println("in binary form:");
		System. out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), 
                        Integer.toBinaryString(c));
                
		a = 3;
		c = (short) (a >>> 1); // zero fill right shift
		System. out.printf("%d >>> 1 = %d\n", a, c);
		System. out.println("in binary form:");
		System. out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), 
                        Integer.toBinaryString(c));
                
		a = -3;
		c = (short) (a >>> 1); // zero fill right shift
		System. out.printf("%d >>> 1 = %d\n", a, c);
		System. out.println("in binary form:");
		System. out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), 
                        Integer.toBinaryString(c));
		
                System.out.println("DataType - byte");
                System.out.println("Logical Assignment Operations");
		
		c = 5;
		System. out.printf("%d += %d --> c = %d\n", c, a, c += a);
		System. out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
		System. out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
		System. out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
		System. out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
		System. out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
		System. out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
		System. out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
		System. out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
		System. out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
		System. out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
				
		System.out.println("DataType - byte");
                System.out.println("Logical Misc Operations");		
		
		System. out.println("\nCondition Operator:");
		System. out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
		(a > b ? a : b));
		System. out.println("\nType Cast Operator:");
                
		byte bt = 127;		
		int i = 2147483647;
		char ch = '\uffff' ;
		long l = 9223372036854775807L;
		float f = 3.4E+38f;
		double d = 1.7E+308;
		boolean bool = true;
		
		c = (short) bt;
		System. out.printf("short = byte: c = %d -> c = %d\n", bt, c);
		c = (short) i;
		System.out.printf("short = int: c = '%d' -> c = %d\n", i, c);
		c = (short) ch;
		System. out.printf("short = char: c = '%c' -> c = %d\n", 
                        ch, c);
		c = (short) l;
		System. out.printf("short = long: c = (short)%d -> c = %d\n", 
                        l, c);
		c = (short) f;
		System. out.printf("short = float: c = (short)%f -> c = %d\n", 
                        f, c);
		c = (short) d;
		System. out.printf("short = double: c = (short)%f -> c = %d\n", 
                        d, c);
		// c = (short) bool;
		System. out.printf("short = boolean: c = (short)%b -> "
                        + "Compile Error\n", bool);
	}
        
        public static void testInt(){
            System.out.println("Coming soon...");
        }
        
        public static void testLong(){
            System.out.println("Coming soon...");
        }
        
        public static void testFloat(){
            System.out.println("Coming soon...");
        }
        
        public static void testDouble(){
            System.out.println("Coming soon...");
        }
        
        public static void testChar(){
            System.out.println("Coming soon...");
        }
        
        public static void testBoolean(){
            System.out.println("Coming soon...");
        }
        public static void testStudent(){
            System.out.println("Coming soon...");
        }
        
        public static void testString(){
            System.out.println("Coming soon...");
        }
}
