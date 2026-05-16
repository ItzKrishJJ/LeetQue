# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def sortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return None
        arr = []
        temp = head
        while(temp):
            arr.append(temp.val)
            temp = temp.next
        arr.sort()
        temp = ListNode
        curr = temp
        for i in range(len(arr)):
            newnode = ListNode(arr[i])
            curr.next = newnode
            curr = curr.next
        return temp.next

        