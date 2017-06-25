
.data
gt: .asciiz "100 > 50\n"
le: .asciiz "100 <= 50 \n"

main:
	li $t0, 100
	ble $t1, 50, print_le
	j print_gt
	j exit
	
	
print_gt:
	la $a0, gt
	li $v0, 4
	syscall
	
print_le:
	la $a0, le
	li $v0, 4
	syscall
	
exit:
	li $v0, 10
	syscall
	
	
	
