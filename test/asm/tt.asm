li $t1, -100
addi $sp, $sp, -4
sw $t1, 0($sp)
li $t1, 100

move $a0, $t1
li $v0, 1
syscall

lw $t1, 0($sp)

move $a0, $t1
li $v0, 1
syscall