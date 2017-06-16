
# int sum = 0;
# for (int i = 0;i < 100;i++){
#      sum += i;
# }
# printf("sum is:%d",sum);
#


.data
sum_is: .asciiz "sum is:"

.text
main:
	li $s0, 0 			#sum = 0;
	li $t0, 0
condition:
	ble $t0, 100, loop_body
	j print
	
loop_body:
	add $s0, $t0, $s0
	add $t0, $t0, 1		#i = 0;
	j condition

	
print:
	la $a0, sum_is
	li $v0, 4
	syscall
	
	move $a0, $s0
	li $v0, 1
	syscall

exit:
	li $v0, 10
	syscall
	
	
	
