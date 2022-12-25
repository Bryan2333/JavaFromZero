package com.collection_.set_.hashset_;

import java.util.HashSet;

public class HashSetSource {
    @SuppressWarnings("all")
    public static void main(String[] args) {

        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");

        System.out.println("set = " + hashSet);


        /*

        final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
           boolean evict) {
		//table 就是 HashMap 的一个数组，类型是 Node[]
        Node<K,V>[] tab; Node<K,V> p; int n, i; //定义辅助变量
        //if语句表示如果table是空的或者大小为0
    	//就进行第一次扩容，扩容到16个空间
        if ((tab = table) == null || (n = tab.length) == 0)
            n = (tab = resize()).length;
        //1. 根据key得到hash，去计算该key应该放到table的哪一个索引位置
        // 并将这个位置的对象赋给p
        //2. 判断p是否为空，如果p为null，就表示还没有元素，就直接创建Node
    	//放在tab[i] = newNode(hash, key, value, null)
        if ((p = tab[i = (n - 1) & hash]) == null)
            tab[i] = newNode(hash, key, value, null);// (key="java", value=PRESENT)
        else {
        // 一个开发技巧提示：在需要的地方定义局部变量(辅助变量)
            Node<K,V> e; K k; //定义辅助变量
            //将当前的hash值给p.hash
            //如果当前索引位置对应的链表的第一个元素和准备添加的key的hash值一样,并且满足以下条件之一
            //1.满足准备加入的key 和 p指向的Node结点 的 key 是同一个对象
            //2.p指向的Node 结点的 key 的equals方法和准备加入的key比较后相同
            //就无法加入
            if (p.hash == hash &&
                ((k = p.key) == key || (key != null && key.equals(k))))
                e = p;
            //再判断 p 是不是一棵红黑树
            //如果是红黑树，就调用 putTreeVal 方法来添加元素
            else if (p instanceof TreeNode)
                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, valu
            else { //如果当前table对应的索引位置已经是一个链表，就用for循环依次比较
                   //1.如果都不相同，就挂载到该链表的最后
                for (int binCount = 0; ; ++binCount) {
                    if ((e = p.next) == null) { //如果p的下一个结点为空，就直接挂载上去
                        p.next = newNode(hash, key, value, null);
                        //3.添加元素到链表后，立即判断该链表是否已经有8个结点
                  		//如果达到8个结点，就调用treeifyBin方法将链表树化
                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                            treeifyBin(tab, hash);
                        break;
                    }
                    //2.如果比较过程中有相同的情况，就直接break退出循环
                    if (e.hash == hash &&
                        ((k = e.key) == key || (key != null && key.equals(k)
                        break;
                    p = e;
                }
            }
            if (e != null) { // existing mapping for key
                V oldValue = e.value;
                if (!onlyIfAbsent || oldValue == null)
                    e.value = value;
                afterNodeAccess(e);
                return oldValue;
            }
        }
        ++modCount;
        if (++size > threshold)
            resize();
        afterNodeInsertion(evict);
        return null; //返回null
    }
         */

    }
}
