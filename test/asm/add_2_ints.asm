main:
	## Get first number from user, put into $t0.
	li $v0, 5 		# load syscall read_int into $v0.
	syscall   		# make the syscall.
	move $t0, $v0   	# move the number read into $t0.
	
	li $v0, 5
	syscall
	move $t1, $v0   	# move the number read into $t1.
	
	add $t2, $t1, $t0   	#add $t1 and $t0 into $t2
	
	## Print out $t2.
	move $a0, $t2		# move the number to print into $a0.
	li $v0, 1		# load syscall print_int into $v0.
	syscall
	
	li $v0, 10		# syscall code 10 is for exit
	syscall

	bne $t1,$t2,haha