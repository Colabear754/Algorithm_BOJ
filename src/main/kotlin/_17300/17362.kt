package _17300

fun main()=print(readln().toInt().let{when(it%8){
1->1
2,0->2
3,7->3
4,6->4
else->5
}})