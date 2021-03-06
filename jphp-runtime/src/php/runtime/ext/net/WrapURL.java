package php.runtime.ext.net;

import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.annotation.Reflection.WrapInterface;
import php.runtime.env.Environment;
import php.runtime.ext.NetExtension;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;

@Name(NetExtension.NAMESPACE + "URL")
@WrapInterface(value = URL.class, skipConflicts = true)
public class WrapURL extends BaseWrapper<URL> {
    public WrapURL(Environment env, URL wrappedObject) {
        super(env, wrappedObject);
    }

    public WrapURL(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public void __construct(String url) throws MalformedURLException {
        __wrappedObject = new URL(url);
    }

    @Signature
    public String __toString() {
        return getWrappedObject().getRef();
    }
}
