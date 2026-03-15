# Stage 1 build
FROM node:18 AS builder

WORKDIR /app
COPY . .

# Stage 2 run
FROM node:18-alpine

WORKDIR /app
COPY --from=builder /app .

EXPOSE 3000

CMD ["node","app.js"]