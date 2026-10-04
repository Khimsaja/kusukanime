package io.ktor.network.selector;

import D6.r;
import H5.InterfaceC0269j;
import e4.k;
import e4.n;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.o;
import l4.InterfaceC1424c;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ5\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00070\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u000f\u001a\u00020\u00072\u001e\u0010\u000e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0011H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0012J\u001d\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 "}, d2 = {"Lio/ktor/network/selector/InterestSuspensionsMap;", "", "<init>", "()V", "Lio/ktor/network/selector/SelectInterest;", "interest", "LH5/j;", "LO3/C;", "continuation", "addSuspension", "(Lio/ktor/network/selector/SelectInterest;LH5/j;)V", "", "readyOps", "Lkotlin/Function1;", "block", "invokeForEachPresent", "(ILe4/k;)V", "Lkotlin/Function2;", "(Le4/n;)V", "removeSuspension", "(Lio/ktor/network/selector/SelectInterest;)LH5/j;", "interestOrdinal", "(I)LH5/j;", "", "toString", "()Ljava/lang/String;", "readHandlerReference", "LH5/j;", "writeHandlerReference", "connectHandlerReference", "acceptHandlerReference", "Companion", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InterestSuspensionsMap {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final AtomicReferenceFieldUpdater<InterestSuspensionsMap, InterfaceC0269j>[] updaters;
    private volatile InterfaceC0269j acceptHandlerReference;
    private volatile InterfaceC0269j connectHandlerReference;
    private volatile InterfaceC0269j readHandlerReference;
    private volatile InterfaceC0269j writeHandlerReference;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bR4\u0010\r\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00060\f8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u000f\u0010\u0003¨\u0006\u0010"}, d2 = {"Lio/ktor/network/selector/InterestSuspensionsMap$Companion;", "", "<init>", "()V", "Lio/ktor/network/selector/SelectInterest;", "interest", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lio/ktor/network/selector/InterestSuspensionsMap;", "LH5/j;", "LO3/C;", "updater", "(Lio/ktor/network/selector/SelectInterest;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "", "updaters", "[Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "getUpdaters$annotations", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private static /* synthetic */ void getUpdaters$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AtomicReferenceFieldUpdater<InterestSuspensionsMap, InterfaceC0269j> updater(SelectInterest interest) {
            return InterestSuspensionsMap.updaters[interest.ordinal()];
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SelectInterest.values().length];
            try {
                iArr[SelectInterest.READ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelectInterest.WRITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelectInterest.ACCEPT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SelectInterest.CONNECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        InterfaceC1424c interfaceC1424c;
        SelectInterest[] allInterests = SelectInterest.INSTANCE.getAllInterests();
        ArrayList arrayList = new ArrayList(allInterests.length);
        for (SelectInterest selectInterest : allInterests) {
            int i7 = WhenMappings.$EnumSwitchMapping$0[selectInterest.ordinal()];
            if (i7 == 1) {
                interfaceC1424c = new o() { // from class: io.ktor.network.selector.InterestSuspensionsMap$Companion$updaters$1$property$1
                    @Override // kotlin.jvm.internal.o, l4.InterfaceC1442u
                    public Object get(Object obj) {
                        return ((InterestSuspensionsMap) obj).readHandlerReference;
                    }

                    @Override // kotlin.jvm.internal.o, l4.InterfaceC1433l
                    public void set(Object obj, Object obj2) {
                        ((InterestSuspensionsMap) obj).readHandlerReference = (InterfaceC0269j) obj2;
                    }
                };
            } else if (i7 == 2) {
                interfaceC1424c = new o() { // from class: io.ktor.network.selector.InterestSuspensionsMap$Companion$updaters$1$property$2
                    @Override // kotlin.jvm.internal.o, l4.InterfaceC1442u
                    public Object get(Object obj) {
                        return ((InterestSuspensionsMap) obj).writeHandlerReference;
                    }

                    @Override // kotlin.jvm.internal.o, l4.InterfaceC1433l
                    public void set(Object obj, Object obj2) {
                        ((InterestSuspensionsMap) obj).writeHandlerReference = (InterfaceC0269j) obj2;
                    }
                };
            } else if (i7 == 3) {
                interfaceC1424c = new o() { // from class: io.ktor.network.selector.InterestSuspensionsMap$Companion$updaters$1$property$3
                    @Override // kotlin.jvm.internal.o, l4.InterfaceC1442u
                    public Object get(Object obj) {
                        return ((InterestSuspensionsMap) obj).acceptHandlerReference;
                    }

                    @Override // kotlin.jvm.internal.o, l4.InterfaceC1433l
                    public void set(Object obj, Object obj2) {
                        ((InterestSuspensionsMap) obj).acceptHandlerReference = (InterfaceC0269j) obj2;
                    }
                };
            } else {
                if (i7 != 4) {
                    throw new r();
                }
                interfaceC1424c = new o() { // from class: io.ktor.network.selector.InterestSuspensionsMap$Companion$updaters$1$property$4
                    @Override // kotlin.jvm.internal.o, l4.InterfaceC1442u
                    public Object get(Object obj) {
                        return ((InterestSuspensionsMap) obj).connectHandlerReference;
                    }

                    @Override // kotlin.jvm.internal.o, l4.InterfaceC1433l
                    public void set(Object obj, Object obj2) {
                        ((InterestSuspensionsMap) obj).connectHandlerReference = (InterfaceC0269j) obj2;
                    }
                };
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater = AtomicReferenceFieldUpdater.newUpdater(InterestSuspensionsMap.class, InterfaceC0269j.class, interfaceC1424c.getName());
            l.d("null cannot be cast to non-null type java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.ktor.network.selector.InterestSuspensionsMap, kotlinx.coroutines.CancellableContinuation<kotlin.Unit>?>", atomicReferenceFieldUpdaterNewUpdater);
            arrayList.add(atomicReferenceFieldUpdaterNewUpdater);
        }
        updaters = (AtomicReferenceFieldUpdater[]) arrayList.toArray(new AtomicReferenceFieldUpdater[0]);
    }

    public final void addSuspension(SelectInterest interest, InterfaceC0269j continuation) {
        l.f("interest", interest);
        l.f("continuation", continuation);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterUpdater = INSTANCE.updater(interest);
        while (!atomicReferenceFieldUpdaterUpdater.compareAndSet(this, null, continuation)) {
            if (atomicReferenceFieldUpdaterUpdater.get(this) != null) {
                throw new IllegalStateException(("Handler for " + interest.name() + " is already registered").toString());
            }
        }
    }

    public final void invokeForEachPresent(int readyOps, k block) {
        InterfaceC0269j interfaceC0269jRemoveSuspension;
        l.f("block", block);
        int[] flags = SelectInterest.INSTANCE.getFlags();
        int length = flags.length;
        for (int i7 = 0; i7 < length; i7++) {
            if ((flags[i7] & readyOps) != 0 && (interfaceC0269jRemoveSuspension = removeSuspension(i7)) != null) {
                block.invoke(interfaceC0269jRemoveSuspension);
            }
        }
    }

    public final InterfaceC0269j removeSuspension(SelectInterest interest) {
        l.f("interest", interest);
        return (InterfaceC0269j) INSTANCE.updater(interest).getAndSet(this, null);
    }

    public String toString() {
        return "R " + this.readHandlerReference + " W " + this.writeHandlerReference + " C " + this.connectHandlerReference + " A " + this.acceptHandlerReference;
    }

    public final InterfaceC0269j removeSuspension(int interestOrdinal) {
        return updaters[interestOrdinal].getAndSet(this, null);
    }

    public final void invokeForEachPresent(n block) {
        l.f("block", block);
        for (SelectInterest selectInterest : SelectInterest.INSTANCE.getAllInterests()) {
            InterfaceC0269j interfaceC0269jRemoveSuspension = removeSuspension(selectInterest);
            if (interfaceC0269jRemoveSuspension != null) {
                block.invoke(interfaceC0269jRemoveSuspension, selectInterest);
            }
        }
    }
}
