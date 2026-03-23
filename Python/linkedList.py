class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class LinkedList:
    def __init__(self):
        self.start = None

    def displayNode(self):
        if self.start is None:
            print("No nodes available")
            return

        s = self.start
        while s is not None:
            print(s.data, end=" -> ")
            s = s.next

        print("None")

    def createNode(self):
        data = int(input("Enter data: "))
        return Node(data)

    def InsertAtFirst(self):
        temp = self.createNode()
        if self.start is None:
            self.start = temp
        else:
            temp.next = self.start
            self.start = temp

    def InsertAtLast(self):
        temp = self.createNode()

        if self.start is None:
            self.start = temp
        else:
            s = self.start
            while s.next is not None:
                s = s.next

            s.next = temp
    def deleteFirst(self):
        if self.start is None:
            print("Linked List is empty")
        else:
            self.start = self.start.next
            
    def deleteLast(self):
        if self.start is None:
            print("Linked List is empty")

        elif self.start.next is None:
            self.start = None

        else:
            s = self.start
            while s.next.next is not None:
                s = s.next
        s.next = None
        
    def countNode(self):
        c = 0
        s = self.next
        
        while s is not None:
            c+= 1
            s = s.next
        print("total Node: " , c)
        
l = LinkedList()

l.InsertAtFirst()
l.InsertAtFirst()
l.displayNode()
# l.deleteLast()
l.countNode()
l.displayNode()
