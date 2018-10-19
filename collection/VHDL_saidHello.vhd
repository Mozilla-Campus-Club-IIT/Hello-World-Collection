entity VHDL_saidHello is
end;

architecture VHDL_saidHello of VHDL_saidHello is
begin
   sayhello : process
   begin
      assert false report "Hello World!"
     severity note;
     wait;
   end process sayhello;
end VHDL_saidHello;
