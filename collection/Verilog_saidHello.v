// Verilog hello world example
module Verilog_saidHello;

initial begin
  $display("Hello World!");
  #10 $finish;
end

endmodule
