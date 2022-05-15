#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.demo;

import org.junit.Assert;
import org.junit.Test;

public class HelloTest {

    @Test
    public void sayHello() {
        Assert.assertEquals("hello up", HelloUtil.sayHello());
    }

    @Test
    public void showContact() {
        Assert.assertEquals("${symbol_pound}${symbol_pound}${symbol_pound}${symbol_pound}${symbol_pound}${symbol_pound}${symbol_pound}${symbol_pound} 1${symbol_escape}n姓名：Aaron${symbol_escape}n电话：90827490${symbol_escape}n${symbol_escape}n${symbol_pound}${symbol_pound}${symbol_pound}${symbol_pound}${symbol_pound}${symbol_pound}${symbol_pound}${symbol_pound} 2${symbol_escape}n姓名：Amy${symbol_escape}n电话：83408927${symbol_escape}n${symbol_escape}n", HelloUtil.showContact());
    }
}