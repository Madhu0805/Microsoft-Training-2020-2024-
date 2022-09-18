class Trie {
	private class Node{
		private char value;
		private HashMap<Character, Node> children = new HashMap<>();
		private boolean isEndOfWord;

		public Node(char value){
			this.value = value;
		}

		public boolean hasChild(char ch){
			return children.containsKey(ch);
		}


		public void addChild(char ch){
			children.put(ch, new Node(ch));
		}

		public Node getChild(char ch){
			return children.get(ch);
		}

	}
	private Node root = new Node(' ');

	public Trie() {

	}

	public void insert(String word) {
		var current = root;

		for(var ch: word.toCharArray()){
			if(!current.hasChild(ch))
				current.addChild(ch);

			current = current.getChild(ch);
		}

		current.isEndOfWord = true;

	}

	public boolean search(String word) {
		if (word == null)
			return false;

		var current= root;
		for(var ch: word.toCharArray()){
			if(!current.hasChild(ch))
				return false;
			current = current.getChild(ch);
		}

		return current.isEndOfWord;
	}

	public boolean startsWith(String prefix) {

		if(prefix == null)
			return false;

		var current = root;

		for(var ch: prefix.toCharArray()){
			if(!current.hasChild(ch))
				return false;

			current = current.getChild(ch);
		}
		return true;
	}
}
