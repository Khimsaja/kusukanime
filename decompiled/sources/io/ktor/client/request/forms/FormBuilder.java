package io.ktor.client.request.forms;

import P3.m;
import S5.n;
import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import io.ktor.http.ContentDisposition;
import io.ktor.http.Headers;
import io.ktor.utils.io.InternalAPI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2517v;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\rJ'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u000e2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u000fJ'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00102\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00122\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0013J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00142\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0015J=\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0010\u0010\u001b\u001a\f\u0012\b\u0012\u00060\u0019j\u0002`\u001a0\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00192\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u001eJ-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u001f2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010!J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\"2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010#J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020$2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010%J%\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&¢\u0006\u0004\b\u000b\u0010(J\u0019\u0010,\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030&0)H\u0000¢\u0006\u0004\b*\u0010+R\u001e\u0010.\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030&0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lio/ktor/client/request/forms/FormBuilder;", "", "<init>", "()V", "T", "", "key", "value", "Lio/ktor/http/Headers;", "headers", "LO3/C;", "append", "(Ljava/lang/String;Ljava/lang/Object;Lio/ktor/http/Headers;)V", "(Ljava/lang/String;Ljava/lang/String;Lio/ktor/http/Headers;)V", "", "(Ljava/lang/String;Ljava/lang/Number;Lio/ktor/http/Headers;)V", "", "(Ljava/lang/String;ZLio/ktor/http/Headers;)V", "", "(Ljava/lang/String;[BLio/ktor/http/Headers;)V", "Lio/ktor/client/request/forms/InputProvider;", "(Ljava/lang/String;Lio/ktor/client/request/forms/InputProvider;Lio/ktor/http/Headers;)V", "", ContentDisposition.Parameters.Size, "Lkotlin/Function0;", "LS5/n;", "Lio/ktor/utils/io/core/Input;", "block", "appendInput", "(Ljava/lang/String;Lio/ktor/http/Headers;Ljava/lang/Long;Le4/a;)V", "(Ljava/lang/String;LS5/n;Lio/ktor/http/Headers;)V", "", "values", "(Ljava/lang/String;Ljava/lang/Iterable;Lio/ktor/http/Headers;)V", "", "(Ljava/lang/String;[Ljava/lang/String;Lio/ktor/http/Headers;)V", "Lio/ktor/client/request/forms/ChannelProvider;", "(Ljava/lang/String;Lio/ktor/client/request/forms/ChannelProvider;Lio/ktor/http/Headers;)V", "Lio/ktor/client/request/forms/FormPart;", "part", "(Lio/ktor/client/request/forms/FormPart;)V", "", "build$ktor_client_core", "()Ljava/util/List;", "build", "", "parts", "Ljava/util/List;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FormBuilder {
    private final List<FormPart<?>> parts = new ArrayList();

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, Object obj, Headers headers, int i7, Object obj2) {
        if ((i7 & 4) != 0) {
            headers = Headers.INSTANCE.getEmpty();
        }
        formBuilder.append(str, (String) obj, headers);
    }

    public static /* synthetic */ void appendInput$default(FormBuilder formBuilder, String str, Headers headers, Long l7, InterfaceC0821a interfaceC0821a, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            headers = Headers.INSTANCE.getEmpty();
        }
        if ((i7 & 4) != 0) {
            l7 = null;
        }
        formBuilder.appendInput(str, headers, l7, interfaceC0821a);
    }

    @InternalAPI
    public final <T> void append(String key, T value, Headers headers) {
        l.f("key", key);
        l.f("value", value);
        l.f("headers", headers);
        this.parts.add(new FormPart<>(key, value, headers));
    }

    public final void appendInput(String key, Headers headers, Long size, InterfaceC0821a block) {
        l.f("key", key);
        l.f("headers", headers);
        l.f("block", block);
        this.parts.add(new FormPart<>(key, new InputProvider(size, block), headers));
    }

    public final List<FormPart<?>> build$ktor_client_core() {
        return this.parts;
    }

    public final void append(String key, String value, Headers headers) {
        l.f("key", key);
        l.f("value", value);
        l.f("headers", headers);
        this.parts.add(new FormPart<>(key, value, headers));
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, String str2, Headers headers, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            headers = Headers.INSTANCE.getEmpty();
        }
        formBuilder.append(str, str2, headers);
    }

    public final void append(String key, Number value, Headers headers) {
        l.f("key", key);
        l.f("value", value);
        l.f("headers", headers);
        this.parts.add(new FormPart<>(key, value, headers));
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, Number number, Headers headers, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            headers = Headers.INSTANCE.getEmpty();
        }
        formBuilder.append(str, number, headers);
    }

    public final void append(String key, boolean value, Headers headers) {
        l.f("key", key);
        l.f("headers", headers);
        this.parts.add(new FormPart<>(key, Boolean.valueOf(value), headers));
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, boolean z7, Headers headers, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            headers = Headers.INSTANCE.getEmpty();
        }
        formBuilder.append(str, z7, headers);
    }

    public final void append(String key, byte[] value, Headers headers) {
        l.f("key", key);
        l.f("value", value);
        l.f("headers", headers);
        this.parts.add(new FormPart<>(key, value, headers));
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, byte[] bArr, Headers headers, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            headers = Headers.INSTANCE.getEmpty();
        }
        formBuilder.append(str, bArr, headers);
    }

    public final void append(String key, InputProvider value, Headers headers) {
        l.f("key", key);
        l.f("value", value);
        l.f("headers", headers);
        this.parts.add(new FormPart<>(key, value, headers));
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, InputProvider inputProvider, Headers headers, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            headers = Headers.INSTANCE.getEmpty();
        }
        formBuilder.append(str, inputProvider, headers);
    }

    public final void append(String key, n value, Headers headers) {
        l.f("key", key);
        l.f("value", value);
        l.f("headers", headers);
        this.parts.add(new FormPart<>(key, value, headers));
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, n nVar, Headers headers, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            headers = Headers.INSTANCE.getEmpty();
        }
        formBuilder.append(str, nVar, headers);
    }

    public final void append(String key, String[] values, Headers headers) {
        l.f("key", key);
        l.f("values", values);
        l.f("headers", headers);
        append(key, m.O(values), headers);
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, Iterable iterable, Headers headers, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            headers = Headers.INSTANCE.getEmpty();
        }
        formBuilder.append(str, (Iterable<String>) iterable, headers);
    }

    public final void append(String key, ChannelProvider value, Headers headers) {
        l.f("key", key);
        l.f("value", value);
        l.f("headers", headers);
        this.parts.add(new FormPart<>(key, value, headers));
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, String[] strArr, Headers headers, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            headers = Headers.INSTANCE.getEmpty();
        }
        formBuilder.append(str, strArr, headers);
    }

    public final <T> void append(FormPart<T> part) {
        l.f("part", part);
        this.parts.add(part);
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, ChannelProvider channelProvider, Headers headers, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            headers = Headers.INSTANCE.getEmpty();
        }
        formBuilder.append(str, channelProvider, headers);
    }

    public final void append(String key, Iterable<String> values, Headers headers) {
        l.f("key", key);
        l.f("values", values);
        l.f("headers", headers);
        if (AbstractC2517v.L(key, "[]", false)) {
            Iterator<String> it = values.iterator();
            while (it.hasNext()) {
                this.parts.add(new FormPart<>(key, it.next(), headers));
            }
            return;
        }
        throw new IllegalArgumentException(AbstractC0703b.j("Array parameter must be suffixed with square brackets ie `", key, "[]`").toString());
    }
}
