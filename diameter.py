class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class BinaryTree:
    def __init__(self):
        self.diameter = 0

    # Method to calculate the height of the tree
    def calculate_height(self, node):
        if not node:
            return 0

        left_height = self.calculate_height(node.left)
        right_height = self.calculate_height(node.right)

        # Update the diameter
        self.diameter = max(self.diameter, left_height + right_height)

        # Return the height of the current node
        return max(left_height, right_height) + 1

# Example usage
if __name__ == "__main__":
    # Create the binary tree
    root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    root.left.left = TreeNode(4)
    root.left.right = TreeNode(5)

    # Find and print the diameter of the binary tree
    tree = BinaryTree()
    tree.calculate_height(root)  # Calculates height and updates diameter
    print("Diameter of the binary tree:", tree.diameter)
