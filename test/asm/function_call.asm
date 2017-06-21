
main:
	li $a0, 3     # set arg 0
   	li $a1, 4     # set arg 1
   	li $a2, 5     # set arg 2
   	jal findMin3 
   	move $s0, $v0 # save return value to $s0

print:
	move $a0, $s0
	li $v0, 1
	syscall
   	
exit:
	li $v0, 10
	syscall

findMin3: 
	move $t0, $a0        # min = x
	bge  $a1, $t0, IF2   # branch if !( y < min )
	# move $t0, $a1        # min = y

IF2:    
	bge  $a1, $t0, END   # branch if !( z < min )
	move $t0, $a2        # min = z
END:    
	move $v0, $t0
    jr $ra