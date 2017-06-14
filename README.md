##WechatSpider 能做什么
* 是一依赖于jsoup通过搜狗引擎来抓取微信公共号最新文章的工具类
* 提供最基础的思路，大家自己自由发挥吧，改成别的语言也比较简单
* 转眼已经两年没有更新了，时光过的好快，有很多中间人模式的更加稳定，但是操作起来稍微复杂一点吧

##如何使用

* 首先导入 WechatSpider.jar 包到工程目录
* 实例化类 `WechatSpider spider = new WechatSpider("xiaomigongsi0406");` 参数为微信公共号的别名，通过搜过搜索相关的公众号，查看微信号
* // new WechatSpider("123").getPageDocs(1); 获取第一页的的全部文章

```java
    String listUrl = spider.getListUrl();
    System.out.println(listUrl);// 列表url

    List<String> list = spider.getTopicUrls(listUrl);
    for (String url : list) {
        Topic topic = spider.getTopicByUrl(url);
        System.out.println(topic.getTitle()); // 文章标题
        // System.out.println(topic.getContent()); // 文章内容
    }
```

##程序健壮性
* 暂时没有异常出现
* 微信推送的文章内的图片都是webp格式,在IOS上显示会有一定的问题，如果下载到自己本地服务器需转格式
* 验证码问题暂时解决

##有问题反馈
在使用中有任何问题，欢迎留言反馈