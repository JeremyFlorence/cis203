
import java.util.*;

public class CharacterTree {

    private static CharTreeNode codeTree = buildTree();

    // write nodeCount() here



    // BONUS: write getMessage() here



    private static CharTreeNode buildTree() {
	CharTreeNode ou = new CharTreeNode(null,
					   new CharTreeNode('O', null, null),
					   new CharTreeNode('U', null, null));
	CharTreeNode nou = new CharTreeNode(null,
					   new CharTreeNode('N', null, null),
					    ou);
	CharTreeNode enou = new CharTreeNode(null,
					   new CharTreeNode('E', null, null),
					    nou);
	CharTreeNode tm = new CharTreeNode(null,
					   new CharTreeNode('T', null, null),
					   new CharTreeNode('M', null, null));
	CharTreeNode atm = new CharTreeNode(null,
					   new CharTreeNode('A', null, null),
					    tm);
	CharTreeNode enouatm = new CharTreeNode(null,
						enou,
						atm);

	CharTreeNode xp = new CharTreeNode(null,
					   new CharTreeNode('X', null, null),
					   new CharTreeNode('P', null, null));
	CharTreeNode ixp = new CharTreeNode(null,
					   new CharTreeNode('I', null, null),
					    xp);                                
	CharTreeNode hs = new CharTreeNode(null,
					   new CharTreeNode('H', null, null),
					   new CharTreeNode('S', null, null));
	CharTreeNode ixphs = new CharTreeNode(null,
					      ixp,
					      hs);
	CharTreeNode rl = new CharTreeNode(null,
					   new CharTreeNode('R', null, null),
					   new CharTreeNode('L', null, null));
	CharTreeNode rlf = new CharTreeNode(null,
					    rl,
					    new CharTreeNode('F', null, null));
	CharTreeNode rlf_ = new CharTreeNode(null,
					     rlf,
					    new CharTreeNode(' ', null, null));
        CharTreeNode ixphsrlf_ = new CharTreeNode(null,
						  ixphs, 
						  rlf_);

        CharTreeNode codeTree = new CharTreeNode(null, enouatm, ixphsrlf_);
	return codeTree;

    }


    // inner class
    static class CharTreeNode {
	public Character letter;
        public CharTreeNode left;
        public CharTreeNode right;
                
       // constructs a leaf node with given data
       public CharTreeNode(char letter) {
           this(letter, null, null);
       }
                        
       // constructs a branch node with given data, left subtree,
       // right subtree
       public CharTreeNode(Character letter, CharTreeNode left, 
                           CharTreeNode right) {
          this.letter = letter;
          this.left = left;
          this.right = right;
       }
    }

}
