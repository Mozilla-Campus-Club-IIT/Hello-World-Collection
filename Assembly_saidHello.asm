# MIPS Assembly

.data
	hello_world: .asciiz "Hello World!\n"

.text
main:
	lui $a0 0x1000  # address of the string hello_world
	addi $v0 $0 4  # syscall code for print string
	syscall

	addi $v0 $0 10  # syscall code for exit
	syscall
