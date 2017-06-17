
# int sum = 0;
# for (int i = 0;i < 100;i++){
#      sum += i;
# }
# printf("sum is:%d",sum);
#


main:
    li $s0, 0 			#sum = 0;
	li $t0, 0

condition:
    li $t1, 1000
	ble $t0, $t1, loop_body
	j print
	
loop_body:
	add $s0, $t0, $s0
	addi $t0, $t0, 1		#i = 0;
	j condition

print:
	move $a0, $s0
	li $v0, 1
	syscall

exit:
	li $v0, 10
	syscall
	
	
	
