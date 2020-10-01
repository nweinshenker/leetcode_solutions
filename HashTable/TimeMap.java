package HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TimeMap {

    class Node {
        int key;
        String value;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    Map<String, List<Node>> map;

    TimeMap() {
        this.map = new HashMap<String, List<Node>>();
    }

    public void set(String key, String value, int timestamp) {
        List<Node> list;
        if (!map.containsKey(key)) {
            list = new ArrayList<Node>();
        } else {
            list = map.get(key);
        }

        list.add(new Node(timestamp, value));

        map.put(key, list);

    }

    public String get(String key, int timestamp) {
        if (!this.map.containsKey(key)) {
            return "";
        }
        List<Node> nodes = this.map.get(key);

        Node result = search(nodes, 0, nodes.size() - 1, null, timestamp);

        if (result == null)
            return "";

        return result.value;

    }

    Node search(List<Node> list, int low, int high, Node currentResult, int timestamp) {
        if (low > high) {
            return currentResult;
        }

        int mid = low + (high - low) / 2;
        Node node = list.get(mid);

        if (node.key <= timestamp) {
            currentResult = node;
            return search(list, mid + 1, high, currentResult, timestamp);
        } else {
            return search(list, low, mid - 1, currentResult, timestamp);
        }
    }
}