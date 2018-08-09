object ReverseLinkedList{

  def main(args: Array[String]){

    var head = Some(new Node(2))
    head.get.nxt = Some(new Node(3))
    head.get.nxt.get.nxt= Some(new Node(5))
    printNodes(head)
    var newHead = reverseAndPrintRecursion(head,None)
    printf("-------")
    printNodes(newHead)
    newHead = reverseAndPrint(newHead)
    printf("s"+newHead.get.num)
    printNodes(newHead)

  }
  def printNodes( head:Option[Node]):Unit =
  {
    head match
    {
      case None => print("......finished")
      case x => { print("  "+x.get.num); printNodes(x.get.nxt) }

    }
  }

  def reverseAndPrintRecursion(head:Option[Node], prvNode:Option[Node]):Option[Node]=
  {
    var newHead = Option(new Node(0))n`
    head match
    {
      case None => return prvNode
      case x => newHead = reverseAndPrintRecursion(x.get.nxt,x)
    }
    prvNode match
    {
      case None => head.get.nxt=None
      case x => head.get.nxt=prvNode
    }
      return newHead

  }

  def reverseAndPrint(head:Option[Node]):Option[Node]=
  {
     var current =head
     var prev :Option[Node] = None
     var nxt : Option[Node] = head.get.nxt
     head.get.nxt = None
     while(current!=None){
        if(prev !=None){
            nxt = current.get.nxt
            current.get.nxt = prev
        }
       prev = current
       current =nxt
     }
n
    return prev
  }

  class Node(var num:Int, var nxt:Option[Node]=None)
}
