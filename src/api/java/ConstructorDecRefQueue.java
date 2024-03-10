package com.microsoft.z3legacy;

public class ConstructorDecRefQueue extends IDecRefQueue<Constructor> {
    public ConstructorDecRefQueue() {
        super();
    }

    @Override
    protected void decRef(Context ctx, long obj) {
        Native.delConstructor(ctx.nCtx(), obj);
    }
}
