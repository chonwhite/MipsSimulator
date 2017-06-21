package com.chonwhite.mips.assembler;

/**
 * Created by hanbuhe on 2017/6/18.
 */
public class Segment {
    /*
     * .byte, .half, .word
     These directives output integers which are 1, 2, or 4 bytes long,
     respectively. A list of values may be given, separated by commas.
     Each value may be repeated a number of times by following it with a colon and a repeat count. For example.
     .byte 3    # 1 byte:3
     .half 1, 2, 3    # 3 halfwords:1 2 3
     .word 5 : 3, 6, 7    # 5 words:5 5 5 6 7
     */


    /*
     * .float, .double
     These output single or double precision floating-point values, respectively. Multiple values and repeat counts may be used in the same way as the integer directives.
     .float 1.4142175 # 1 single-precision value .double1e+10, 3.1415 # 2 double-precision values
     .ascii, .asciiz
     These directives output ASCII strings, either without or with a terminating null character respectively. The following example outputs two identical strings:
     .ascii "Hello\0" .asciiz"Hello"
     */


    /*
     * .align
     This directive allows the programmer to specify an alignment greater than that which would normally be required for the next data directive. The alignment is specified as a power of two, for example:
     .align 4 # align to 16-byte boundary (24) var: .word 0
     */


    /*
    .space
The .space directive increments the current section’s location counter
by a number of bytes, for example:
struc:.word 3
.space 120 # 120 byte gap .word -1
     */


    /*
    .globl
Unlike C, where module-level data and functions are automatically global unless declared with thestatic keyword, all assembler labels have local binding unless explicitly modified by the .globl directive.
     */
}
