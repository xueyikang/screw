package cn.moyada.screw.model;

/**
 * Created by xueyikang on 2017/12/11.
 */
public class OrderDetailDO {

    private String item;

    private Integer count;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void test() {
        getProxy();
    }

    private void getProxy(Class... ctl) {
        System.out.println("getProxy1");
    }

    private void getProxy(ClassLoader classLoader, Class... ctl) {
        System.out.println("getProxy2");
    }
}
