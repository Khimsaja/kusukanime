package io.ktor.network.sockets;

import P3.F;
import P3.r;
import P3.z;
import b1.AbstractC0703b;
import io.ktor.http.ContentDisposition;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.SocketOption;
import java.nio.channels.DatagramChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000eJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u000f¢\u0006\u0004\b\u000b\u0010\u0010R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"Lio/ktor/network/sockets/SocketOptionsPlatformCapabilities;", "", "<init>", "()V", "", ContentDisposition.Parameters.Name, "socketOption", "(Ljava/lang/String;)Ljava/lang/Object;", "Ljava/nio/channels/SocketChannel;", "channel", "LO3/C;", "setReusePort", "(Ljava/nio/channels/SocketChannel;)V", "Ljava/nio/channels/ServerSocketChannel;", "(Ljava/nio/channels/ServerSocketChannel;)V", "Ljava/nio/channels/DatagramChannel;", "(Ljava/nio/channels/DatagramChannel;)V", "", "Ljava/lang/reflect/Field;", "standardSocketOptions", "Ljava/util/Map;", "Ljava/lang/reflect/Method;", "channelSetOption", "Ljava/lang/reflect/Method;", "serverChannelSetOption", "datagramSetOption", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SocketOptionsPlatformCapabilities {
    public static final SocketOptionsPlatformCapabilities INSTANCE;
    private static final Method channelSetOption;
    private static final Method datagramSetOption;
    private static final Method serverChannelSetOption;
    private static final Map<String, Field> standardSocketOptions;

    static {
        Method method;
        Method method2;
        Map map = z.f7780k;
        INSTANCE = new SocketOptionsPlatformCapabilities();
        try {
            Field[] fields = Class.forName("java.net.StandardSocketOptions").getFields();
            if (fields != null) {
                ArrayList arrayList = new ArrayList();
                for (Field field : fields) {
                    int modifiers = field.getModifiers();
                    if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers) && Modifier.isPublic(modifiers)) {
                        arrayList.add(field);
                    }
                }
                int I = F.I(r.p(arrayList, 10));
                if (I < 16) {
                    I = 16;
                }
                Map linkedHashMap = new LinkedHashMap(I);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    String name = ((Field) next).getName();
                    l.e("getName(...)", name);
                    linkedHashMap.put(name, next);
                }
                map = linkedHashMap;
            }
        } catch (Throwable unused) {
        }
        standardSocketOptions = map;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("java.nio.channels.SocketChannel");
            Method[] methods = cls.getMethods();
            l.e("getMethods(...)", methods);
            int length = methods.length;
            for (int i7 = 0; i7 < length; i7++) {
                method = methods[i7];
                int modifiers2 = method.getModifiers();
                if (Modifier.isPublic(modifiers2) && !Modifier.isStatic(modifiers2) && l.a(method.getName(), "setOption") && method.getParameterTypes().length == 2 && l.a(method.getReturnType(), cls) && l.a(method.getParameterTypes()[0], SocketOption.class) && l.a(method.getParameterTypes()[1], Object.class)) {
                    break;
                }
            }
        } catch (Throwable unused2) {
        }
        method = null;
        channelSetOption = method;
        try {
            Class<?> cls2 = Class.forName("java.nio.channels.ServerSocketChannel");
            Method[] methods2 = cls2.getMethods();
            l.e("getMethods(...)", methods2);
            int length2 = methods2.length;
            for (int i8 = 0; i8 < length2; i8++) {
                method2 = methods2[i8];
                int modifiers3 = method2.getModifiers();
                if (Modifier.isPublic(modifiers3) && !Modifier.isStatic(modifiers3) && l.a(method2.getName(), "setOption") && method2.getParameterTypes().length == 2 && l.a(method2.getReturnType(), cls2) && l.a(method2.getParameterTypes()[0], SocketOption.class) && l.a(method2.getParameterTypes()[1], Object.class)) {
                    break;
                }
            }
        } catch (Throwable unused3) {
        }
        method2 = null;
        serverChannelSetOption = method2;
        try {
            Class<?> cls3 = Class.forName("java.nio.channels.DatagramChannel");
            Method[] methods3 = cls3.getMethods();
            l.e("getMethods(...)", methods3);
            int length3 = methods3.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length3) {
                    break;
                }
                Method method4 = methods3[i9];
                int modifiers4 = method4.getModifiers();
                if (Modifier.isPublic(modifiers4) && !Modifier.isStatic(modifiers4) && l.a(method4.getName(), "setOption") && method4.getParameterTypes().length == 2 && l.a(method4.getReturnType(), cls3) && l.a(method4.getParameterTypes()[0], SocketOption.class) && l.a(method4.getParameterTypes()[1], Object.class)) {
                    method3 = method4;
                    break;
                }
                i9++;
            }
        } catch (Throwable unused4) {
        }
        datagramSetOption = method3;
    }

    private SocketOptionsPlatformCapabilities() {
    }

    private final Object socketOption(String name) throws IOException {
        Object obj;
        Field field = standardSocketOptions.get(name);
        if (field == null || (obj = field.get(null)) == null) {
            throw new IOException(AbstractC0703b.j("Socket option ", name, " is not supported"));
        }
        return obj;
    }

    public final void setReusePort(SocketChannel channel) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        l.f("channel", channel);
        Object objSocketOption = socketOption("SO_REUSEPORT");
        Method method = channelSetOption;
        l.c(method);
        method.invoke(channel, objSocketOption, Boolean.TRUE);
    }

    public final void setReusePort(ServerSocketChannel channel) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        l.f("channel", channel);
        Object objSocketOption = socketOption("SO_REUSEPORT");
        Method method = serverChannelSetOption;
        l.c(method);
        method.invoke(channel, objSocketOption, Boolean.TRUE);
    }

    public final void setReusePort(DatagramChannel channel) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        l.f("channel", channel);
        Object objSocketOption = socketOption("SO_REUSEPORT");
        Method method = datagramSetOption;
        l.c(method);
        method.invoke(channel, objSocketOption, Boolean.TRUE);
    }
}
