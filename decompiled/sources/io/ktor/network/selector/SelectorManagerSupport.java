package io.ktor.network.selector;

import H5.C0270k;
import H5.InterfaceC0269j;
import O3.C;
import P3.r;
import S3.c;
import S3.h;
import T3.a;
import e4.k;
import java.io.IOException;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.SelectorProvider;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\b&\u0018\u00002\u00020\u0001:\u00018B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H$¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0004¢\u0006\u0004\b \u0010!J!\u0010 \u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0004¢\u0006\u0004\b \u0010\"R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u0010)\u001a\u00020(8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010/\u001a\u00020(8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R,\u00107\u001a\u0004\u0018\u00010\u0004*\u00020\u000e2\b\u00102\u001a\u0004\u0018\u00010\u00048B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00069"}, d2 = {"Lio/ktor/network/selector/SelectorManagerSupport;", "Lio/ktor/network/selector/SelectorManager;", "<init>", "()V", "Lio/ktor/network/selector/Selectable;", "selectable", "LO3/C;", "publishInterest", "(Lio/ktor/network/selector/Selectable;)V", "Lio/ktor/network/selector/SelectInterest;", "interest", "select", "(Lio/ktor/network/selector/Selectable;Lio/ktor/network/selector/SelectInterest;LS3/c;)Ljava/lang/Object;", "", "Ljava/nio/channels/SelectionKey;", "selectedKeys", "", "keys", "handleSelectedKeys", "(Ljava/util/Set;Ljava/util/Set;)V", "key", "handleSelectedKey", "(Ljava/nio/channels/SelectionKey;)V", "Ljava/nio/channels/Selector;", "selector", "applyInterest", "(Ljava/nio/channels/Selector;Lio/ktor/network/selector/Selectable;)V", "attachment", "notifyClosedImpl", "(Ljava/nio/channels/Selector;Ljava/nio/channels/SelectionKey;Lio/ktor/network/selector/Selectable;)V", "", "cause", "cancelAllSuspensions", "(Lio/ktor/network/selector/Selectable;Ljava/lang/Throwable;)V", "(Ljava/nio/channels/Selector;Ljava/lang/Throwable;)V", "Ljava/nio/channels/spi/SelectorProvider;", "provider", "Ljava/nio/channels/spi/SelectorProvider;", "getProvider", "()Ljava/nio/channels/spi/SelectorProvider;", "", "pending", "I", "getPending", "()I", "setPending", "(I)V", "cancelled", "getCancelled", "setCancelled", "newValue", "getSubject", "(Ljava/nio/channels/SelectionKey;)Lio/ktor/network/selector/Selectable;", "setSubject", "(Ljava/nio/channels/SelectionKey;Lio/ktor/network/selector/Selectable;)V", "subject", "ClosedSelectorCancellationException", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class SelectorManagerSupport implements SelectorManager {
    private int cancelled;
    private int pending;
    private final SelectorProvider provider;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/network/selector/SelectorManagerSupport$ClosedSelectorCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "<init>", "()V", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClosedSelectorCancellationException extends CancellationException {
        public ClosedSelectorCancellationException() {
            super("Closed selector");
        }
    }

    public SelectorManagerSupport() {
        SelectorProvider selectorProviderProvider = SelectorProvider.provider();
        l.e("provider(...)", selectorProviderProvider);
        this.provider = selectorProviderProvider;
    }

    private final Selectable getSubject(SelectionKey selectionKey) {
        Object objAttachment = selectionKey.attachment();
        if (objAttachment instanceof Selectable) {
            return (Selectable) objAttachment;
        }
        return null;
    }

    private final void setSubject(SelectionKey selectionKey, Selectable selectable) {
        selectionKey.attach(selectable);
    }

    public final void applyInterest(Selector selector, Selectable selectable) {
        l.f("selector", selector);
        l.f("selectable", selectable);
        try {
            SelectableChannel channel = selectable.getChannel();
            SelectionKey selectionKeyKeyFor = channel.keyFor(selector);
            int i7 = selectable.get_interestedOps();
            if (selectionKeyKeyFor == null) {
                if (i7 != 0) {
                    channel.register(selector, i7, selectable);
                }
            } else if (selectionKeyKeyFor.interestOps() != i7) {
                selectionKeyKeyFor.interestOps(i7);
            }
            if (i7 != 0) {
                this.pending++;
            }
        } catch (Throwable th) {
            SelectionKey selectionKeyKeyFor2 = selectable.getChannel().keyFor(selector);
            if (selectionKeyKeyFor2 != null) {
                selectionKeyKeyFor2.cancel();
            }
            cancelAllSuspensions(selectable, th);
        }
    }

    public final void cancelAllSuspensions(Selectable attachment, Throwable cause) {
        l.f("attachment", attachment);
        l.f("cause", cause);
        InterestSuspensionsMap suspensions = attachment.getSuspensions();
        for (SelectInterest selectInterest : SelectInterest.INSTANCE.getAllInterests()) {
            InterfaceC0269j interfaceC0269jRemoveSuspension = suspensions.removeSuspension(selectInterest);
            if (interfaceC0269jRemoveSuspension != null) {
                interfaceC0269jRemoveSuspension.resumeWith(r.r(cause));
            }
        }
    }

    public final int getCancelled() {
        return this.cancelled;
    }

    @Override // io.ktor.network.selector.SelectorManager, H5.A
    public abstract /* synthetic */ h getCoroutineContext();

    public final int getPending() {
        return this.pending;
    }

    @Override // io.ktor.network.selector.SelectorManager
    public final SelectorProvider getProvider() {
        return this.provider;
    }

    public final void handleSelectedKey(SelectionKey key) {
        InterfaceC0269j interfaceC0269jRemoveSuspension;
        l.f("key", key);
        try {
            int i7 = key.readyOps();
            int iInterestOps = key.interestOps();
            Selectable subject = getSubject(key);
            if (subject == null) {
                key.cancel();
                this.cancelled++;
                return;
            }
            InterestSuspensionsMap suspensions = subject.getSuspensions();
            int[] flags = SelectInterest.INSTANCE.getFlags();
            int length = flags.length;
            for (int i8 = 0; i8 < length; i8++) {
                if ((flags[i8] & i7) != 0 && (interfaceC0269jRemoveSuspension = suspensions.removeSuspension(i8)) != null) {
                    interfaceC0269jRemoveSuspension.resumeWith(C.a);
                }
            }
            int i9 = (~i7) & iInterestOps;
            if (i9 != iInterestOps) {
                key.interestOps(i9);
            }
            if (i9 != 0) {
                this.pending++;
            }
        } catch (Throwable th) {
            key.cancel();
            this.cancelled++;
            Selectable subject2 = getSubject(key);
            if (subject2 != null) {
                cancelAllSuspensions(subject2, th);
                setSubject(key, null);
            }
        }
    }

    public final void handleSelectedKeys(Set<SelectionKey> selectedKeys, Set<? extends SelectionKey> keys) {
        l.f("selectedKeys", selectedKeys);
        l.f("keys", keys);
        int size = selectedKeys.size();
        this.pending = keys.size() - size;
        this.cancelled = 0;
        if (size <= 0) {
            return;
        }
        Iterator<SelectionKey> it = selectedKeys.iterator();
        while (it.hasNext()) {
            handleSelectedKey(it.next());
            it.remove();
        }
    }

    public final void notifyClosedImpl(Selector selector, SelectionKey key, Selectable attachment) {
        l.f("selector", selector);
        l.f("key", key);
        l.f("attachment", attachment);
        cancelAllSuspensions(attachment, new ClosedChannelException());
        setSubject(key, null);
        selector.wakeup();
    }

    public abstract void publishInterest(Selectable selectable);

    @Override // io.ktor.network.selector.SelectorManager
    public final Object select(Selectable selectable, SelectInterest selectInterest, c<? super C> cVar) throws IOException {
        int i7 = selectable.get_interestedOps();
        int flag = selectInterest.getFlag();
        if (selectable.isClosed()) {
            SelectorManagerSupportKt.selectableIsClosed();
            throw new D6.r();
        }
        if ((i7 & flag) == 0) {
            SelectorManagerSupportKt.selectableIsInvalid(i7, flag);
            throw new D6.r();
        }
        C0270k c0270k = new C0270k(1, r.E(cVar));
        c0270k.r();
        c0270k.t(new k() { // from class: io.ktor.network.selector.SelectorManagerSupport$select$2$1
            public final void invoke(Throwable th) {
            }

            @Override // e4.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C.a;
            }
        });
        selectable.getSuspensions().addSuspension(selectInterest, c0270k);
        if (!c0270k.isCancelled()) {
            publishInterest(selectable);
        }
        Object objQ = c0270k.q();
        return objQ == a.f9048k ? objQ : C.a;
    }

    public final void setCancelled(int i7) {
        this.cancelled = i7;
    }

    public final void setPending(int i7) {
        this.pending = i7;
    }

    public final void cancelAllSuspensions(Selector selector, Throwable cause) {
        l.f("selector", selector);
        if (cause == null) {
            cause = new ClosedSelectorCancellationException();
        }
        Set<SelectionKey> setKeys = selector.keys();
        l.e("keys(...)", setKeys);
        for (SelectionKey selectionKey : setKeys) {
            try {
                if (selectionKey.isValid()) {
                    selectionKey.interestOps(0);
                }
            } catch (CancelledKeyException unused) {
            }
            Object objAttachment = selectionKey.attachment();
            Selectable selectable = objAttachment instanceof Selectable ? (Selectable) objAttachment : null;
            if (selectable != null) {
                cancelAllSuspensions(selectable, cause);
            }
            selectionKey.cancel();
        }
    }
}
